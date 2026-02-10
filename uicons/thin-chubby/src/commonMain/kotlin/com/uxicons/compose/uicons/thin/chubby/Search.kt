package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Search: ImageVector? = null

val Icons.Tc.Search: ImageVector
    get() = _Search ?: UXIcon(name = "Search") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 22.13f)
                lineToRelative(-4.96f, -4.94f)
                curveToRelative(1.36f, -1.57f, 2.08f, -3.81f, 2.13f, -6.71f)
                curveToRelative(-0.1f, -6.07f, -3.48f, -9.43f, -9.52f, -9.47f)
                curveTo(4.4f, 1.05f, 1f, 4.55f, 1f, 10.48f)
                curveToRelative(0f, 6.05f, 3.31f, 9.45f, 9.52f, 9.49f)
                curveToRelative(2.87f, -0.02f, 5.1f, -0.71f, 6.67f, -2.07f)
                lineToRelative(4.96f, 4.94f)
                curveToRelative(0.31f, 0.28f, 0.61f, 0.1f, 0.71f, 0f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.0f, -0.71f)
                close()
                moveTo(10.52f, 18.97f)
                curveToRelative(-5.62f, -0.03f, -8.41f, -2.81f, -8.52f, -8.48f)
                curveToRelative(0.1f, -5.67f, 2.89f, -8.44f, 8.51f, -8.48f)
                curveToRelative(5.55f, 0.04f, 8.42f, 2.89f, 8.52f, 8.47f)
                curveToRelative(-0.1f, 5.68f, -2.89f, 8.45f, -8.51f, 8.49f)
                close()
            }
        }.also { _Search = it}
