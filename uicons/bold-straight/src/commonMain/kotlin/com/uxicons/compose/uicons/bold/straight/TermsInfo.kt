package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TermsInfo: ImageVector? = null

val Icons.Bs.TermsInfo: ImageVector
    get() = _TermsInfo ?: UXIcon(name = "TermsInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 8f)
                lineTo(5f, 8f)
                verticalLineToRelative(-3f)
                lineTo(13f, 5f)
                verticalLineToRelative(3f)
                close()
                moveTo(9f, 18f)
                verticalLineToRelative(-3f)
                lineTo(5f, 15f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(19f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(19f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10.59f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(14.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7.09f)
                curveToRelative(0.93f, -0.38f, 1.94f, -0.59f, 3f, -0.59f)
                lineTo(18f, 3.5f)
                curveTo(18f, 1.57f, 16.43f, 0f, 14.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(12.72f, 24f)
                curveToRelative(-0.93f, -0.81f, -1.66f, -1.84f, -2.13f, -3f)
                close()
                moveTo(13f, 11.77f)
                verticalLineToRelative(-1.77f)
                lineTo(5f, 10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.76f)
                curveToRelative(0.36f, -0.46f, 0.78f, -0.86f, 1.24f, -1.23f)
                close()
            }
        }.also { _TermsInfo = it}
