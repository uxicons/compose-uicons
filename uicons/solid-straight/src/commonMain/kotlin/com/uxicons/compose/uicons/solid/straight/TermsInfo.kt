package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TermsInfo: ImageVector? = null

val Icons.Ss.TermsInfo: ImageVector
    get() = _TermsInfo ?: UXIcon(name = "TermsInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -2.39f, 1.06f, -4.53f, 2.72f, -6f)
                lineTo(4f, 12f)
                verticalLineToRelative(-2f)
                lineTo(14f, 10f)
                verticalLineToRelative(1.08f)
                curveToRelative(1.18f, -0.68f, 2.54f, -1.08f, 4f, -1.08f)
                lineTo(18f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(12.72f, 24f)
                curveToRelative(-1.67f, -1.47f, -2.72f, -3.61f, -2.72f, -6f)
                close()
                moveTo(4f, 5f)
                lineTo(14f, 5f)
                verticalLineToRelative(2f)
                lineTo(4f, 7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(8f, 17f)
                lineTo(4f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _TermsInfo = it}
