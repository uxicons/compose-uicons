package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManatSign: ImageVector? = null

val Icons.Sc.ManatSign: ImageVector
    get() = _ManatSign ?: UXIcon(name = "ManatSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 14.91f)
                curveToRelative(0f, 0.14f, -0.01f, 3.44f, -0.49f, 6.8f)
                curveToRelative(-0.11f, 0.75f, -0.75f, 1.29f, -1.48f, 1.29f)
                curveToRelative(-0.9f, 0.01f, -1.62f, -0.82f, -1.49f, -1.71f)
                curveToRelative(0.45f, -3.14f, 0.46f, -6.34f, 0.46f, -6.37f)
                curveToRelative(0f, -5.39f, -1.69f, -7.52f, -6.5f, -7.86f)
                verticalLineToRelative(14.44f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-14.44f)
                curveToRelative(-4.82f, 0.34f, -6.5f, 2.47f, -6.5f, 7.86f)
                curveToRelative(0f, 0.03f, 0.01f, 3.23f, 0.46f, 6.37f)
                curveToRelative(0.12f, 0.82f, -0.45f, 1.58f, -1.27f, 1.7f)
                curveToRelative(-0.82f, 0.12f, -1.58f, -0.45f, -1.7f, -1.27f)
                curveToRelative(-0.48f, -3.36f, -0.49f, -6.66f, -0.49f, -6.8f)
                curveToRelative(0f, -7.03f, 2.95f, -10.43f, 9.5f, -10.86f)
                verticalLineToRelative(-1.55f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.55f)
                curveToRelative(6.55f, 0.43f, 9.5f, 3.83f, 9.5f, 10.86f)
                close()
            }
        }.also { _ManatSign = it}
