package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerSlowest: ImageVector? = null

val Icons.Rr.TachometerSlowest: ImageVector
    get() = _TachometerSlowest ?: UXIcon(name = "TachometerSlowest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.45f, 21.52f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.07f, 0.13f)
                lineToRelative(-1.03f, -0.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.31f, -1.51f)
                lineToRelative(1.03f, 0.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.36f, -0.04f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14.11f, -0.04f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.4f, 0.08f)
                lineToRelative(1.03f, -0.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.31f, 1.51f)
                lineToRelative(-1.03f, 0.89f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.12f, -0.18f)
                arcTo(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4.05f)
                curveTo(11.02f, -2.36f, 22.75f, 2f, 23.9f, 11.44f)
                arcTo(11.96f, 11.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.45f, 21.52f)
                close()
                moveTo(12f, 11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.99f, 1.78f)
                lineTo(5.14f, 14.92f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.8f, 1.83f)
                lineToRelative(4.87f, -2.14f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 11f)
                close()
            }
        }.also { _TachometerSlowest = it}
