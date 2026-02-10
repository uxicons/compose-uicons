package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AgeRestrictionSeven: ImageVector? = null

val Icons.Sr.AgeRestrictionSeven: ImageVector
    get() = _AgeRestrictionSeven ?: UXIcon(name = "AgeRestrictionSeven") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(11.79f, 9.82f)
                lineToRelative(-3.93f, 6.69f)
                curveToRelative(-0.19f, 0.32f, -0.52f, 0.49f, -0.86f, 0.49f)
                curveToRelative(-0.17f, 0f, -0.35f, -0.04f, -0.51f, -0.14f)
                curveToRelative(-0.48f, -0.28f, -0.64f, -0.89f, -0.35f, -1.37f)
                lineToRelative(3.83f, -6.52f)
                lineToRelative(-2.97f, 0.02f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.68f, 0f, 1.3f, 0.35f, 1.66f, 0.92f)
                curveToRelative(0.36f, 0.58f, 0.39f, 1.29f, 0.09f, 1.9f)
                close()
                moveTo(18f, 13f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _AgeRestrictionSeven = it}
