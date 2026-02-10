package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckMoving: ImageVector? = null

val Icons.Sr.TruckMoving: ImageVector
    get() = _TruckMoving ?: UXIcon(name = "TruckMoving") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18f)
                lineTo(1f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(0f, 5.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 1f)
                horizontalLineToRelative(6f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5.5f)
                close()
                moveTo(17f, 13f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(24f, 13f)
                close()
                moveTo(0.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(6.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(15.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(17f, 11f)
                horizontalLineToRelative(6.72f)
                curveToRelative(-0.02f, -0.08f, -1.08f, -3.27f, -1.08f, -3.27f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.84f, 5f)
                lineTo(17f, 5f)
                close()
            }
        }.also { _TruckMoving = it}
