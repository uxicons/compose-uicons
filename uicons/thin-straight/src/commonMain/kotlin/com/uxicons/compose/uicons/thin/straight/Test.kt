package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Test: ImageVector? = null

val Icons.Ts.Test: ImageVector
    get() = _Test ?: UXIcon(name = "Test") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(8.56f, 19.87f)
                curveToRelative(-0.08f, 0.09f, -0.2f, 0.13f, -0.31f, 0.13f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.12f, 0f, -0.23f, -0.05f, -0.31f, -0.13f)
                lineToRelative(-1.08f, -1.1f)
                lineToRelative(-0.71f, 0.7f)
                lineToRelative(1.08f, 1.1f)
                curveToRelative(0.27f, 0.28f, 0.63f, 0.43f, 1.02f, 0.43f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.39f, 0f, 0.75f, -0.15f, 1.02f, -0.43f)
                lineToRelative(2.08f, -2.1f)
                lineToRelative(-0.71f, -0.7f)
                lineToRelative(-2.08f, 2.1f)
                close()
                moveTo(9.91f, 16f)
                horizontalLineToRelative(-1.03f)
                lineToRelative(1.83f, -6.93f)
                curveToRelative(0.09f, -0.39f, 0.35f, -0.72f, 0.72f, -0.91f)
                curveToRelative(0.37f, -0.19f, 0.81f, -0.2f, 1.19f, -0.04f)
                curveToRelative(0.4f, 0.17f, 0.71f, 0.54f, 0.81f, 0.98f)
                lineToRelative(1.71f, 6.9f)
                horizontalLineToRelative(-1.03f)
                lineToRelative(-0.5f, -2f)
                horizontalLineToRelative(-3.18f)
                lineToRelative(-0.53f, 2f)
                close()
                moveTo(10.7f, 13f)
                horizontalLineToRelative(2.67f)
                lineToRelative(-0.91f, -3.67f)
                curveToRelative(-0.03f, -0.14f, -0.12f, -0.25f, -0.23f, -0.3f)
                curveToRelative(-0.12f, -0.05f, -0.24f, -0.05f, -0.35f, 0.01f)
                curveToRelative(-0.1f, 0.05f, -0.18f, 0.15f, -0.21f, 0.26f)
                lineToRelative(-0.97f, 3.69f)
                close()
                moveTo(22.0f, 7.29f)
                verticalLineToRelative(16.71f)
                lineTo(2f, 24f)
                lineTo(2f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(10.21f)
                lineToRelative(7.29f, 7.29f)
                close()
                moveTo(15.0f, 7f)
                horizontalLineToRelative(5.29f)
                lineTo(15f, 1.71f)
                verticalLineToRelative(5.29f)
                close()
                moveTo(21.0f, 23f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(-7f)
                lineTo(14.0f, 1f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(18f)
                close()
            }
        }.also { _Test = it}
