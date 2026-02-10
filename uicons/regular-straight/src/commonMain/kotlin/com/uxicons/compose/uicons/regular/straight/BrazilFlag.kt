package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrazilFlag: ImageVector? = null

val Icons.Rs.BrazilFlag: ImageVector
    get() = _BrazilFlag ?: UXIcon(name = "BrazilFlag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(6.12f)
                lineTo(12.69f, 4f)
                horizontalLineToRelative(8.31f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(19.85f, 12f)
                lineToRelative(-7.85f, 6.01f)
                lineToRelative(-7.85f, -6.01f)
                lineToRelative(7.85f, -6.01f)
                lineToRelative(7.85f, 6.01f)
                close()
                moveTo(3f, 4f)
                lineTo(11.31f, 4f)
                lineTo(2f, 11.12f)
                lineTo(2f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 12.88f)
                lineToRelative(9.31f, 7.12f)
                lineTo(2f, 20f)
                verticalLineToRelative(-7.12f)
                close()
                moveTo(12.69f, 20f)
                lineToRelative(9.31f, -7.12f)
                verticalLineToRelative(7.12f)
                lineTo(12.69f, 20f)
                close()
                moveTo(15.49f, 12.14f)
                curveToRelative(-2.2f, -1.83f, -4.67f, -2.39f, -6.0f, -2.56f)
                curveToRelative(0.64f, -0.66f, 1.53f, -1.08f, 2.52f, -1.08f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 0.05f, -0.01f, 0.09f, -0.01f, 0.14f)
                close()
                moveTo(8.5f, 12f)
                curveToRelative(0f, -0.17f, 0.03f, -0.33f, 0.05f, -0.5f)
                curveToRelative(0.45f, 0.02f, 3.71f, 0.23f, 6.19f, 2.65f)
                curveToRelative(-0.64f, 0.81f, -1.62f, 1.34f, -2.74f, 1.34f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                close()
            }
        }.also { _BrazilFlag = it}
