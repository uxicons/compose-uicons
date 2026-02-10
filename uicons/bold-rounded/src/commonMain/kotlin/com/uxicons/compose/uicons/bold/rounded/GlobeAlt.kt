package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeAlt: ImageVector? = null

val Icons.Br.GlobeAlt: ImageVector
    get() = _GlobeAlt ?: UXIcon(name = "GlobeAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.42f, 15f)
            arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.5f, -7.5f)
            arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 7.5f)
            close()
            moveTo(13.42f, 3f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, 4.5f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, -4.5f)
            close()
            moveTo(23.74f, 14.56f)
            arcToRelative(12.49f, 12.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.32f, 5.38f)
            verticalLineToRelative(1.06f)
            horizontalLineToRelative(3.08f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(2.92f)
            verticalLineToRelative(-1.18f)
            arcToRelative(12.49f, 12.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.48f, -19.14f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.51f, 1.64f)
            arcToRelative(9.5f, 9.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.81f, 10.54f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.47f, 1.7f)
            close()
        }
    }.also { _GlobeAlt = it }
