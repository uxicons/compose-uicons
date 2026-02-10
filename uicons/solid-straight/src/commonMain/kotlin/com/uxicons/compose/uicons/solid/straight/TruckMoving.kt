package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckMoving: ImageVector? = null

val Icons.Ss.TruckMoving: ImageVector
    get() = _TruckMoving ?: UXIcon(name = "TruckMoving") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.94f, 20f)
                curveTo(5.53f, 23.95f, -0.53f, 23.95f, 0.06f, 20f)
                close()
                moveTo(22.4f, 7.05f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.56f, 5f)
                lineTo(16f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7.72f)
                close()
                moveTo(7.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(11f, 1f)
                lineTo(3f, 1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                lineTo(0f, 18f)
                lineTo(14f, 18f)
                lineTo(14f, 4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 1f)
                close()
                moveTo(24f, 13f)
                lineTo(16f, 13f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(8f)
                close()
                moveTo(17.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
            }
        }.also { _TruckMoving = it}
