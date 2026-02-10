package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeSimple: ImageVector? = null

val Icons.Tc.CodeSimple: ImageVector
    get() = _CodeSimple ?: UXIcon(name = "CodeSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.12f, 19.08f)
                curveToRelative(-4.1f, -2.62f, -6.45f, -6.13f, -7.04f, -7.08f)
                curveToRelative(0.59f, -0.95f, 2.94f, -4.46f, 7.04f, -7.08f)
                curveToRelative(0.23f, -0.15f, 0.3f, -0.46f, 0.15f, -0.69f)
                curveToRelative(-0.15f, -0.23f, -0.46f, -0.3f, -0.69f, -0.15f)
                curveTo(3.6f, 7.26f, 1.17f, 11.57f, 1.06f, 11.76f)
                curveToRelative(-0.08f, 0.15f, -0.08f, 0.34f, 0f, 0.49f)
                curveToRelative(0.1f, 0.18f, 2.54f, 4.5f, 7.52f, 7.68f)
                curveToRelative(0.08f, 0.05f, 0.45f, 0.21f, 0.69f, -0.15f)
                curveToRelative(0.15f, -0.23f, 0.08f, -0.54f, -0.15f, -0.69f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.94f, 11.76f)
                curveToRelative(-0.1f, -0.18f, -2.54f, -4.5f, -7.52f, -7.68f)
                curveToRelative(-0.23f, -0.15f, -0.54f, -0.08f, -0.69f, 0.15f)
                curveToRelative(-0.15f, 0.23f, -0.08f, 0.54f, 0.15f, 0.69f)
                curveToRelative(4.1f, 2.62f, 6.45f, 6.13f, 7.04f, 7.08f)
                curveToRelative(-0.59f, 0.95f, -2.94f, 4.46f, -7.04f, 7.08f)
                curveToRelative(-0.23f, 0.15f, -0.31f, 0.46f, -0.15f, 0.69f)
                curveToRelative(0.24f, 0.36f, 0.61f, 0.21f, 0.69f, 0.15f)
                curveToRelative(4.98f, -3.18f, 7.42f, -7.5f, 7.52f, -7.68f)
                curveToRelative(0.08f, -0.15f, 0.08f, -0.34f, 0f, -0.49f)
                close()
            }
        }.also { _CodeSimple = it}
