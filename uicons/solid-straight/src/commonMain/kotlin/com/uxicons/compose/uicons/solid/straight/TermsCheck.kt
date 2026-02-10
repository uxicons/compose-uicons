package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TermsCheck: ImageVector? = null

val Icons.Ss.TermsCheck: ImageVector
    get() = _TermsCheck ?: UXIcon(name = "TermsCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(12.63f, 24f)
                lineToRelative(-3.74f, -3.86f)
                lineToRelative(4.31f, -4.17f)
                lineToRelative(3.08f, 3.18f)
                lineToRelative(1.72f, -1.7f)
                lineTo(18.0f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(8f, 17f)
                lineTo(4f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(14f, 12f)
                lineTo(4f, 12f)
                verticalLineToRelative(-2f)
                lineTo(14f, 10f)
                verticalLineToRelative(2f)
                close()
                moveTo(14f, 7f)
                lineTo(4f, 7f)
                verticalLineToRelative(-2f)
                lineTo(14f, 5f)
                verticalLineToRelative(2f)
                close()
                moveTo(16.29f, 24f)
                curveToRelative(-0.56f, 0f, -1.08f, -0.22f, -1.47f, -0.61f)
                lineToRelative(-3.1f, -3.21f)
                lineToRelative(1.44f, -1.39f)
                lineToRelative(3.09f, 3.2f)
                lineToRelative(6.17f, -6.08f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-6.07f, 6.07f)
                curveToRelative(-0.39f, 0.39f, -0.91f, 0.61f, -1.47f, 0.61f)
                close()
            }
        }.also { _TermsCheck = it}
