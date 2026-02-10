package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CageEmpty: ImageVector? = null

val Icons.Rr.CageEmpty: ImageVector
    get() = _CageEmpty ?: UXIcon(name = "CageEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                horizontalLineToRelative(-1f)
                lineTo(21f, 11f)
                curveToRelative(0f, -4.5f, -3.32f, -8.22f, -7.63f, -8.88f)
                curveToRelative(0.09f, -0.19f, 0.14f, -0.4f, 0.14f, -0.61f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.22f, 0.05f, 0.43f, 0.14f, 0.61f)
                curveTo(6.32f, 2.78f, 3f, 6.5f, 3f, 11f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(22f, 24f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(13f, 4.47f)
                curveToRelative(0.95f, 0.88f, 1.79f, 2.93f, 1.96f, 5.53f)
                horizontalLineToRelative(-1.96f)
                lineTo(13f, 4.47f)
                close()
                moveTo(11f, 4.47f)
                verticalLineToRelative(5.53f)
                horizontalLineToRelative(-1.96f)
                curveToRelative(0.17f, -2.6f, 1.01f, -4.65f, 1.96f, -5.53f)
                close()
                moveTo(11f, 12f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 12f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 12f)
                close()
                moveTo(17f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                lineTo(17f, 12f)
                close()
                moveTo(18.92f, 10f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(-0.1f, -1.86f, -0.5f, -3.51f, -1.1f, -4.83f)
                curveToRelative(1.62f, 1.08f, 2.76f, 2.82f, 3.05f, 4.83f)
                close()
                moveTo(8.13f, 5.17f)
                curveToRelative(-0.61f, 1.32f, -1.0f, 2.97f, -1.1f, 4.83f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(0.29f, -2.01f, 1.43f, -3.75f, 3.05f, -4.83f)
                close()
                moveTo(5f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 12f)
                close()
            }
        }.also { _CageEmpty = it}
