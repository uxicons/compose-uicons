package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Superscript: ImageVector? = null

val Icons.Rr.Superscript: ImageVector
    get() = _Superscript ?: UXIcon(name = "Superscript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(22f, 3.39f)
                lineToRelative(-0.78f, 0.81f)
                curveToRelative(-0.38f, 0.4f, -1.02f, 0.41f, -1.41f, 0.03f)
                curveToRelative(-0.4f, -0.38f, -0.41f, -1.02f, -0.03f, -1.41f)
                lineToRelative(2.41f, -2.5f)
                curveToRelative(0.19f, -0.2f, 0.45f, -0.31f, 0.72f, -0.31f)
                curveToRelative(0.55f, 0f, 1.09f, 0.45f, 1.09f, 1f)
                close()
                moveTo(14.63f, 6.22f)
                curveToRelative(-0.43f, -0.35f, -1.06f, -0.28f, -1.41f, 0.15f)
                lineToRelative(-5.72f, 7.04f)
                lineTo(1.78f, 6.37f)
                curveToRelative(-0.35f, -0.43f, -0.98f, -0.49f, -1.41f, -0.15f)
                curveToRelative(-0.43f, 0.35f, -0.49f, 0.98f, -0.15f, 1.41f)
                lineToRelative(5.99f, 7.37f)
                lineTo(0.22f, 22.37f)
                curveToRelative(-0.35f, 0.43f, -0.28f, 1.06f, 0.15f, 1.41f)
                curveToRelative(0.18f, 0.15f, 0.41f, 0.22f, 0.63f, 0.22f)
                curveToRelative(0.29f, 0f, 0.58f, -0.13f, 0.78f, -0.37f)
                lineToRelative(5.72f, -7.04f)
                lineToRelative(5.72f, 7.04f)
                curveToRelative(0.2f, 0.24f, 0.49f, 0.37f, 0.78f, 0.37f)
                curveToRelative(0.22f, 0f, 0.45f, -0.07f, 0.63f, -0.22f)
                curveToRelative(0.43f, -0.35f, 0.49f, -0.98f, 0.15f, -1.41f)
                lineToRelative(-5.99f, -7.37f)
                lineToRelative(5.99f, -7.37f)
                curveToRelative(0.35f, -0.43f, 0.28f, -1.06f, -0.15f, -1.41f)
                close()
            }
        }.also { _Superscript = it}
