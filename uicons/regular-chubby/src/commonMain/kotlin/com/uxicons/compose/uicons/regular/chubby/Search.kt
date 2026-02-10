package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Search: ImageVector? = null

val Icons.Rc.Search: ImageVector
    get() = _Search ?: UXIcon(name = "Search") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.7f, 21.25f)
                lineToRelative(-4.4f, -4.37f)
                curveToRelative(1.18f, -1.56f, 1.81f, -3.68f, 1.86f, -6.33f)
                curveToRelative(-0.1f, -6.09f, -3.51f, -9.47f, -9.59f, -9.51f)
                curveTo(4.42f, 1.08f, 1f, 4.65f, 1f, 10.55f)
                curveToRelative(0f, 6.2f, 3.43f, 9.51f, 9.59f, 9.55f)
                curveToRelative(2.63f, -0.02f, 4.74f, -0.63f, 6.3f, -1.8f)
                lineToRelative(4.4f, 4.38f)
                curveToRelative(0.52f, 0.49f, 1.13f, 0.29f, 1.41f, -0.0f)
                curveToRelative(0.38f, -0.4f, 0.39f, -1.02f, -0.0f, -1.41f)
                close()
                moveTo(3f, 10.57f)
                curveToRelative(0.1f, -5.04f, 2.58f, -7.5f, 7.58f, -7.53f)
                curveToRelative(4.95f, 0.03f, 7.5f, 2.57f, 7.59f, 7.51f)
                curveToRelative(-0.09f, 5.12f, -2.5f, 7.52f, -7.58f, 7.55f)
                curveToRelative(-5.08f, -0.03f, -7.49f, -2.42f, -7.59f, -7.53f)
                close()
            }
        }.also { _Search = it}
