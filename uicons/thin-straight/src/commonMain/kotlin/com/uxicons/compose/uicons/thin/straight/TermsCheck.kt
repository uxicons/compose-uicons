package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TermsCheck: ImageVector? = null

val Icons.Ts.TermsCheck: ImageVector
    get() = _TermsCheck ?: UXIcon(name = "TermsCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 6f)
                lineTo(4f, 6f)
                verticalLineToRelative(-1f)
                lineTo(14f, 5f)
                verticalLineToRelative(1f)
                close()
                moveTo(14f, 10f)
                lineTo(4f, 10f)
                verticalLineToRelative(1f)
                lineTo(14f, 11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(4f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(4f, 15f)
                verticalLineToRelative(1f)
                close()
                moveTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(15.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(17f, 19.59f)
                reflectiveCurveToRelative(1f, -1f, 1f, -1f)
                lineTo(18f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(12.64f, 24f)
                reflectiveCurveToRelative(-0.97f, -1f, -0.97f, -1f)
                lineTo(1f, 23f)
                close()
                moveTo(23.31f, 16.11f)
                lineToRelative(-6.69f, 6.69f)
                curveToRelative(-0.27f, 0.27f, -0.7f, 0.27f, -0.96f, 0.01f)
                lineToRelative(-3.41f, -3.52f)
                lineToRelative(-0.72f, 0.69f)
                lineToRelative(3.41f, 3.53f)
                curveToRelative(0.33f, 0.33f, 0.76f, 0.49f, 1.19f, 0.49f)
                reflectiveCurveToRelative(0.86f, -0.17f, 1.19f, -0.49f)
                lineToRelative(6.69f, -6.69f)
                lineToRelative(-0.71f, -0.71f)
                close()
            }
        }.also { _TermsCheck = it}
