package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarTilt: ImageVector? = null

val Icons.Ss.CarTilt: ImageVector
    get() = _CarTilt ?: UXIcon(name = "CarTilt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.27f, 22f)
                lineToRelative(3.9f, -2.48f)
                lineToRelative(-1.07f, -1.69f)
                lineToRelative(6.75f, -4.3f)
                lineToRelative(1.07f, 1.69f)
                lineToRelative(4.22f, -2.69f)
                lineToRelative(-1.07f, -1.69f)
                lineToRelative(1.69f, -1.07f)
                lineTo(21.91f, 6.9f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.64f, -2.03f)
                lineTo(2.21f, 16.37f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.15f, 2.35f)
                lineToRelative(1.83f, 2.87f)
                lineToRelative(1.69f, -1.07f)
                lineTo(7.82f, 22f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                lineTo(24f, 24f)
                lineTo(24f, 22f)
                close()
                moveTo(18.74f, 9.38f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.69f, 1.07f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.74f, 9.38f)
                close()
                moveTo(7.24f, 15.52f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.31f, 17.2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 15.52f)
                close()
                moveTo(1.02f, 8.43f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.37f, -2.84f)
                lineTo(10.43f, 0.47f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.58f, 0.43f)
                lineToRelative(4.38f, 2.63f)
                curveToRelative(0.24f, 0.14f, 0.46f, 0.31f, 0.69f, 0.47f)
                lineTo(1.68f, 14.34f)
                curveToRelative(-0.05f, -0.28f, -0.11f, -0.55f, -0.14f, -0.83f)
                close()
            }
        }.also { _CarTilt = it}
