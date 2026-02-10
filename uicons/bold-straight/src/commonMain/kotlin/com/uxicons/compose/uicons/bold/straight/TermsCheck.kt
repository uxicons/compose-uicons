package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TermsCheck: ImageVector? = null

val Icons.Bs.TermsCheck: ImageVector
    get() = _TermsCheck ?: UXIcon(name = "TermsCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.14f, 21f)
                lineToRelative(2.75f, 3f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(14.5f, 0f)
                curveTo(16.43f, 0f, 18f, 1.57f, 18f, 3.5f)
                lineTo(18f, 15.73f)
                reflectiveCurveToRelative(-2.18f, 2.18f, -2.18f, 2.18f)
                lineToRelative(-0.81f, -0.89f)
                lineTo(15.0f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(3f, 21f)
                horizontalLineToRelative(6.14f)
                close()
                moveTo(13f, 5f)
                lineTo(5f, 5f)
                verticalLineToRelative(3f)
                lineTo(13f, 8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(13f, 10f)
                lineTo(5f, 10f)
                verticalLineToRelative(3f)
                lineTo(13f, 13f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5f, 18f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                lineTo(5f, 15f)
                verticalLineToRelative(3f)
                close()
                moveTo(21.89f, 14.67f)
                lineToRelative(-6.14f, 6.14f)
                lineToRelative(-2.99f, -3.26f)
                lineToRelative(-2.21f, 2.03f)
                lineToRelative(3.37f, 3.67f)
                curveToRelative(0.5f, 0.5f, 1.16f, 0.75f, 1.82f, 0.75f)
                reflectiveCurveToRelative(1.32f, -0.25f, 1.82f, -0.75f)
                lineToRelative(6.45f, -6.45f)
                lineToRelative(-2.12f, -2.12f)
                close()
            }
        }.also { _TermsCheck = it}
