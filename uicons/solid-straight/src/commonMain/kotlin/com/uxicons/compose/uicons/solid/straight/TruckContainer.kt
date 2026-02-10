package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckContainer: ImageVector? = null

val Icons.Ss.TruckContainer: ImageVector
    get() = _TruckContainer ?: UXIcon(name = "TruckContainer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 1f)
                lineTo(3f, 1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                lineTo(0f, 14f)
                lineTo(14f, 14f)
                lineTo(14f, 4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 1f)
                close()
                moveTo(4f, 11f)
                lineTo(2f, 11f)
                lineTo(2f, 4f)
                lineTo(4f, 4f)
                close()
                moveTo(8f, 11f)
                lineTo(6f, 11f)
                lineTo(6f, 4f)
                lineTo(8f, 4f)
                close()
                moveTo(10f, 11f)
                lineTo(10f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                lineTo(10f, 11f)
                moveToRelative(6f, 0f)
                lineTo(16f, 5f)
                horizontalLineToRelative(3.56f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.4f, 7.05f)
                lineTo(23.72f, 11f)
                close()
                moveTo(0f, 18f)
                lineTo(0f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 13f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(5f)
                close()
                moveTo(0.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(7.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(17.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
            }
        }.also { _TruckContainer = it}
