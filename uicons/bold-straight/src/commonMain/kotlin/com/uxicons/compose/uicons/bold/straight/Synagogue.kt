package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Synagogue: ImageVector? = null

val Icons.Bs.Synagogue: ImageVector
    get() = _Synagogue ?: UXIcon(name = "Synagogue") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6.73f)
                lineToRelative(0.9f, 1.5f)
                horizontalLineToRelative(2.1f)
                lineToRelative(-1.05f, 1.75f)
                lineToRelative(1.05f, 1.75f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(-0.9f, 1.5f)
                lineToRelative(-0.9f, -1.5f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(1.05f, -1.75f)
                lineToRelative(-1.05f, -1.75f)
                horizontalLineToRelative(2.1f)
                lineToRelative(0.9f, -1.5f)
                close()
                moveTo(24f, 12.05f)
                verticalLineToRelative(11.95f)
                lineTo(0f, 24f)
                verticalLineToRelative(-11.95f)
                lineToRelative(4f, -2.91f)
                lineToRelative(1f, 0.73f)
                verticalLineToRelative(-4.64f)
                lineTo(12f, 0.14f)
                lineToRelative(7f, 5.09f)
                verticalLineToRelative(4.64f)
                lineToRelative(1f, -0.73f)
                lineToRelative(4f, 2.91f)
                close()
                moveTo(5f, 13.58f)
                lineToRelative(-1f, -0.73f)
                lineToRelative(-1f, 0.73f)
                verticalLineToRelative(7.42f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.42f)
                close()
                moveTo(16f, 6.76f)
                lineToRelative(-4f, -2.91f)
                lineToRelative(-4f, 2.91f)
                verticalLineToRelative(14.24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                lineTo(16f, 6.76f)
                close()
                moveTo(21f, 13.58f)
                lineToRelative(-1f, -0.73f)
                lineToRelative(-1f, 0.73f)
                verticalLineToRelative(7.42f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.42f)
                close()
            }
        }.also { _Synagogue = it}
