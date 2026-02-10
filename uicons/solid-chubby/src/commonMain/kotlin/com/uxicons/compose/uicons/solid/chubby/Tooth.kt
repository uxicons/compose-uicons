package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tooth: ImageVector? = null

val Icons.Sc.Tooth: ImageVector
    get() = _Tooth ?: UXIcon(name = "Tooth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.02f, 21.64f)
                curveToRelative(-0.54f, 0f, -0.98f, -0.42f, -1.0f, -0.96f)
                curveToRelative(-0.0f, -0.05f, 0.0f, -0.13f, 0.01f, -0.18f)
                curveToRelative(0.29f, -2.62f, 0.21f, -5.88f, -0.65f, -6.83f)
                curveToRelative(-0.27f, -0.3f, -0.48f, -0.31f, -0.75f, -0.01f)
                curveToRelative(-0.85f, 0.95f, -0.94f, 4.21f, -0.65f, 6.84f)
                curveToRelative(0.01f, 0.05f, 0.01f, 0.13f, 0.01f, 0.18f)
                curveToRelative(-0.02f, 0.54f, -0.46f, 0.96f, -1.0f, 0.96f)
                curveToRelative(-2.44f, 0f, -6.04f, -4.09f, -7.75f, -7.77f)
                curveToRelative(-1.73f, -3.73f, -1.64f, -7.02f, 0.26f, -9.26f)
                curveToRelative(1.17f, -1.38f, 2.68f, -2.18f, 4.24f, -2.24f)
                curveToRelative(1.48f, -0.06f, 2.85f, 0.51f, 4.0f, 1.66f)
                curveToRelative(0.84f, 0.84f, 1.7f, 0.85f, 2.55f, 0f)
                curveToRelative(1.15f, -1.15f, 2.52f, -1.72f, 3.98f, -1.66f)
                curveToRelative(1.55f, 0.06f, 3.05f, 0.86f, 4.22f, 2.24f)
                curveToRelative(1.91f, 2.25f, 2.0f, 5.55f, 0.27f, 9.3f)
                curveToRelative(-1.69f, 3.66f, -5.29f, 7.73f, -7.75f, 7.73f)
                close()
            }
        }.also { _Tooth = it}
