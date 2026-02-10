package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentSigned: ImageVector? = null

val Icons.Ts.DocumentSigned: ImageVector
    get() = _DocumentSigned ?: UXIcon(name = "DocumentSigned") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7.29f)
                lineTo(14.71f, 0f)
                close()
                moveTo(15f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(15f, 1.71f)
                close()
                moveTo(3f, 23f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                lineTo(3f, 23f)
                close()
                moveTo(6f, 10f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                lineTo(6f, 11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 14f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                lineTo(6f, 15f)
                verticalLineToRelative(-1f)
                close()
                moveTo(17.09f, 17.72f)
                lineToRelative(0.83f, 0.56f)
                curveToRelative(-0.05f, 0.07f, -1.17f, 1.72f, -3.42f, 1.72f)
                curveToRelative(-1.25f, 0f, -2.04f, -0.43f, -2.73f, -0.81f)
                curveToRelative(-0.67f, -0.37f, -1.25f, -0.69f, -2.24f, -0.69f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-1.61f, 0.01f, -2.59f, 1.29f, -2.6f, 1.3f)
                lineToRelative(-0.8f, -0.6f)
                curveToRelative(0.05f, -0.07f, 1.28f, -1.69f, 3.4f, -1.7f)
                horizontalLineToRelative(0.03f)
                curveToRelative(1.25f, 0f, 2.03f, 0.43f, 2.72f, 0.81f)
                curveToRelative(0.67f, 0.37f, 1.26f, 0.69f, 2.25f, 0.69f)
                curveToRelative(1.69f, 0f, 2.55f, -1.23f, 2.58f, -1.28f)
                close()
            }
        }.also { _DocumentSigned = it}
