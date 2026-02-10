package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Search: ImageVector? = null

val Icons.Sc.Search: ImageVector
    get() = _Search ?: UXIcon(name = "Search") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.55f, 20.37f)
                lineToRelative(-4.33f, -4.29f)
                curveToRelative(0.96f, -1.47f, 1.47f, -3.39f, 1.51f, -5.73f)
                curveToRelative(-0.1f, -5.94f, -3.43f, -9.23f, -9.37f, -9.27f)
                curveTo(4.34f, 1.11f, 1.0f, 4.52f, 1.0f, 10.35f)
                curveToRelative(0f, 5.75f, 3.35f, 9.27f, 9.37f, 9.31f)
                curveToRelative(2.33f, -0.01f, 4.25f, -0.51f, 5.73f, -1.46f)
                lineToRelative(4.34f, 4.31f)
                curveToRelative(0.56f, 0.52f, 1.46f, 0.61f, 2.12f, -0.01f)
                curveToRelative(0.6f, -0.57f, 0.58f, -1.54f, -0.01f, -2.12f)
                close()
            }
        }.also { _Search = it}
