package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TermsCheck: ImageVector? = null

val Icons.Rs.TermsCheck: ImageVector
    get() = _TermsCheck ?: UXIcon(name = "TermsCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                lineTo(4f, 12f)
                verticalLineToRelative(-2f)
                lineTo(14f, 10f)
                verticalLineToRelative(2f)
                close()
                moveTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(15f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(16f, 19.47f)
                reflectiveCurveToRelative(2f, -1.97f, 2f, -1.97f)
                lineTo(18f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(12.63f, 24f)
                reflectiveCurveToRelative(-1.94f, -2f, -1.94f, -2f)
                lineTo(2f, 22f)
                close()
                moveTo(22.42f, 15.9f)
                lineToRelative(-6.07f, 6.07f)
                curveToRelative(-0.02f, 0.03f, -0.08f, 0.03f, -0.1f, 0.01f)
                lineToRelative(-3.09f, -3.2f)
                lineToRelative(-1.44f, 1.39f)
                lineToRelative(3.1f, 3.21f)
                curveToRelative(0.39f, 0.39f, 0.91f, 0.61f, 1.47f, 0.61f)
                reflectiveCurveToRelative(1.08f, -0.22f, 1.47f, -0.61f)
                lineToRelative(6.07f, -6.07f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(14f, 5f)
                lineTo(4f, 5f)
                verticalLineToRelative(2f)
                lineTo(14f, 7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(4f, 17f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                lineTo(4f, 15f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _TermsCheck = it}
