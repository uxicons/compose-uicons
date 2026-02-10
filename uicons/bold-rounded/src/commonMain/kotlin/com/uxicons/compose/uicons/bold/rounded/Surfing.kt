package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Surfing: ImageVector? = null

val Icons.Br.Surfing: ImageVector
    get() = _Surfing ?: UXIcon(name = "Surfing") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.64f, 0.01f)
            curveToRelative(-3.78f, 0f, -8.05f, 2.01f, -11.4f, 5.37f)
            arcToRelative(37.3f, 37.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.89f, 11.49f)
            arcToRelative(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.93f, 4.81f)
            lineToRelative(1.06f, 1.06f)
            arcToRelative(4.34f, 4.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.81f, 0.93f)
            arcToRelative(37.17f, 37.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.49f, -7.89f)
            curveToRelative(3.36f, -3.36f, 5.37f, -7.62f, 5.37f, -11.41f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.36f, -4.36f)
            close()
            moveTo(16.51f, 13.64f)
            arcToRelative(34.19f, 34.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.55f, 7.25f)
            arcToRelative(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.81f, 0.08f)
            lineToRelative(11.41f, -11.42f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineToRelative(-11.41f, 11.41f)
            arcToRelative(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.08f, -0.81f)
            arcToRelative(34.25f, 34.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.25f, -10.55f)
            curveToRelative(3.31f, -3.31f, 6.96f, -4.49f, 9.28f, -4.49f)
            curveToRelative(1.08f, 0f, 1.36f, 0.28f, 1.36f, 1.35f)
            curveToRelative(0f, 2.32f, -1.18f, 5.98f, -4.49f, 9.29f)
            close()
        }
    }.also { _Surfing = it }
