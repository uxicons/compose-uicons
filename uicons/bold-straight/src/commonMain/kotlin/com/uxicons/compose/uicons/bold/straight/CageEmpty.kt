package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CageEmpty: ImageVector? = null

val Icons.Bs.CageEmpty: ImageVector
    get() = _CageEmpty ?: UXIcon(name = "CageEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21f)
                lineTo(21f, 11f)
                curveToRelative(0f, -4.5f, -3.32f, -8.22f, -7.63f, -8.88f)
                curveToRelative(0.09f, -0.19f, 0.14f, -0.4f, 0.14f, -0.61f)
                curveTo(13.5f, 0.67f, 12.83f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.22f, 0.05f, 0.43f, 0.14f, 0.61f)
                curveTo(6.32f, 2.78f, 3f, 6.5f, 3f, 11f)
                verticalLineToRelative(10f)
                lineTo(1f, 21f)
                verticalLineToRelative(3f)
                lineTo(23f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(12.98f, 10f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(0.11f, -2.33f, 0.59f, -3.94f, 0.98f, -4.68f)
                curveToRelative(0.39f, 0.73f, 0.87f, 2.35f, 0.98f, 4.68f)
                close()
                moveTo(13f, 13f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 13f)
                horizontalLineToRelative(2f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 13f)
                close()
                moveTo(17.91f, 10f)
                horizontalLineToRelative(-1.93f)
                curveToRelative(-0.05f, -1.33f, -0.22f, -2.69f, -0.52f, -3.9f)
                curveToRelative(1.28f, 0.9f, 2.19f, 2.29f, 2.46f, 3.9f)
                close()
                moveTo(8.56f, 6.09f)
                curveToRelative(-0.31f, 1.19f, -0.48f, 2.53f, -0.54f, 3.91f)
                horizontalLineToRelative(-1.93f)
                curveToRelative(0.27f, -1.61f, 1.19f, -3.01f, 2.47f, -3.91f)
                close()
                moveTo(6f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 13f)
                close()
            }
        }.also { _CageEmpty = it}
