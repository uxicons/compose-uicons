package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationDesign: ImageVector? = null

val Icons.Sr.TransformationDesign: ImageVector
    get() = _TransformationDesign ?: UXIcon(name = "TransformationDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(2f, 4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(2f, 10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(2f, 16f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(20.48f, 20.11f)
                lineToRelative(3.46f, -15.22f)
                curveToRelative(0.27f, -1.19f, -0.01f, -2.43f, -0.77f, -3.38f)
                reflectiveCurveToRelative(-1.9f, -1.5f, -3.13f, -1.5f)
                horizontalLineToRelative(-4.64f)
                curveToRelative(-2.35f, 0f, -4.35f, 1.6f, -4.88f, 3.89f)
                lineToRelative(-3.46f, 15.22f)
                curveToRelative(-0.27f, 1.19f, 0.01f, 2.43f, 0.77f, 3.38f)
                reflectiveCurveToRelative(1.9f, 1.5f, 3.13f, 1.5f)
                horizontalLineToRelative(4.64f)
                curveToRelative(2.35f, 0f, 4.35f, -1.6f, 4.88f, -3.89f)
                close()
                moveTo(10.12f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.11f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _TransformationDesign = it}
