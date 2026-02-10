package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeEditing: ImageVector? = null

val Icons.Bs.CodeEditing: ImageVector
    get() = _CodeEditing ?: UXIcon(name = "CodeEditing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.11f, 9.15f)
                lineToRelative(-1.89f, 1.89f)
                lineToRelative(1.9f, 1.9f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.26f, -2.26f)
                curveToRelative(-0.47f, -0.47f, -0.73f, -1.09f, -0.73f, -1.76f)
                reflectiveCurveToRelative(0.26f, -1.29f, 0.73f, -1.76f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(15.01f, 15.06f)
                lineTo(17.27f, 12.8f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.09f, 0.73f, -1.76f)
                reflectiveCurveToRelative(-0.26f, -1.29f, -0.73f, -1.76f)
                lineToRelative(-2.25f, -2.25f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.89f, 1.89f)
                lineToRelative(-1.9f, 1.9f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(23.36f, 13.64f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-7.28f, 7.28f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                close()
                moveTo(9.23f, 17.0f)
                lineTo(8.31f, 16.0f)
                horizontalLineToRelative(-3.31f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(6.11f)
                curveToRelative(0.84f, -0.78f, 1.93f, -1.14f, 3f, -1.09f)
                verticalLineToRelative(-8.02f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(7.09f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(-4.86f)
                close()
            }
        }.also { _CodeEditing = it}
