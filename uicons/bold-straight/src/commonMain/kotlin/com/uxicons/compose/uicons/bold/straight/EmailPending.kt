package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailPending: ImageVector? = null

val Icons.Bs.EmailPending: ImageVector
    get() = _EmailPending ?: UXIcon(name = "EmailPending") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 11.71f)
                curveToRelative(1.15f, -0.34f, 2.18f, -0.97f, 3f, -1.81f)
                verticalLineToRelative(14.11f)
                lineTo(0f, 24f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(8.79f)
                curveToRelative(-0.19f, 0.63f, -0.29f, 1.3f, -0.29f, 2f)
                curveToRelative(0f, 0.34f, 0.03f, 0.67f, 0.08f, 1f)
                lineTo(3.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(0.38f)
                lineToRelative(7.37f, 7.45f)
                curveToRelative(0.86f, 0.86f, 2.39f, 0.87f, 3.26f, -0.01f)
                lineToRelative(2.81f, -2.81f)
                curveToRelative(0.79f, 0.31f, 1.65f, 0.49f, 2.56f, 0.49f)
                curveToRelative(0.45f, 0f, 0.9f, -0.05f, 1.33f, -0.13f)
                lineToRelative(-4.58f, 4.58f)
                curveToRelative(-1.0f, 1.0f, -2.34f, 1.55f, -3.75f, 1.55f)
                reflectiveCurveToRelative(-2.75f, -0.55f, -3.75f, -1.55f)
                lineToRelative(-5.25f, -5.3f)
                verticalLineToRelative(9.85f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-9.29f)
                close()
                moveTo(14f, 5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(18f, 5.41f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.71f, -1.71f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.41f)
                close()
            }
        }.also { _EmailPending = it}
