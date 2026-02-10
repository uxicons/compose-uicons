package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TermsInfo: ImageVector? = null

val Icons.Rs.TermsInfo: ImageVector
    get() = _TermsInfo ?: UXIcon(name = "TermsInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7f)
                lineTo(4f, 7f)
                verticalLineToRelative(-2f)
                lineTo(14f, 5f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 17f)
                verticalLineToRelative(-2f)
                lineTo(4f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                close()
                moveTo(9.52f, 22f)
                lineTo(2f, 22f)
                reflectiveCurveTo(2f, 3f, 2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(15f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.06f)
                curveToRelative(0.33f, -0.04f, 0.66f, -0.06f, 1f, -0.06f)
                reflectiveCurveToRelative(0.67f, 0.02f, 1f, 0.06f)
                lineTo(18f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(11.35f, 24f)
                curveToRelative(-0.71f, -0.57f, -1.32f, -1.24f, -1.83f, -2f)
                close()
                moveTo(11.35f, 10f)
                lineTo(4f, 10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.52f)
                curveToRelative(0.51f, -0.76f, 1.12f, -1.43f, 1.83f, -2f)
                close()
            }
        }.also { _TermsInfo = it}
