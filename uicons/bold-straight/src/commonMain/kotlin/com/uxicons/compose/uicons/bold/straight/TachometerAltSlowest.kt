package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltSlowest: ImageVector? = null

val Icons.Bs.TachometerAltSlowest: ImageVector
    get() = _TachometerAltSlowest ?: UXIcon(name = "TachometerAltSlowest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.42f, -0.04f)
                lineToRelative(-4.49f, 2.37f)
                lineToRelative(-1.4f, -2.65f)
                lineToRelative(4.43f, -2.34f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                close()
                moveTo(16.95f, 8.05f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12.77f)
                lineToRelative(3.61f, -1.91f)
                arcToRelative(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.56f, -0.69f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.13f, 6.1f)
                lineToRelative(1.73f, 2.45f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.92f, -0.78f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -9.9f)
                close()
                moveTo(24f, 13f)
                arcToRelative(12.04f, 12.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.97f, 9.71f)
                lineTo(18.64f, 23f)
                lineTo(5.36f, 23f)
                lineToRelative(-0.39f, -0.29f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 13f)
                close()
                moveTo(21f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.35f, 20f)
                lineTo(17.65f, 20f)
                arcTo(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 13f)
                close()
            }
        }.also { _TachometerAltSlowest = it}
