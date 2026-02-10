package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sword: ImageVector? = null

val Icons.Br.Sword: ImageVector
    get() = _Sword ?: UXIcon(name = "Sword") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.27f, 0.73f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.31f, -0.67f)
            arcToRelative(15.96f, 15.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.82f, 4.14f)
            lineToRelative(-8.22f, 8.22f)
            arcToRelative(15.07f, 15.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.21f, -1.41f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.43f, 2.97f)
            arcToRelative(12.29f, 12.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.67f, 1.94f)
            lineToRelative(-2.95f, 2.95f)
            lineToRelative(-0.44f, -0.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
            lineToRelative(3f, 3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
            lineToRelative(-0.44f, -0.44f)
            lineToRelative(2.95f, -2.95f)
            arcToRelative(12.29f, 12.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.95f, 4.67f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.48f, 1.28f)
            arcToRelative(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.21f, -0.01f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.27f, -1.7f)
            arcToRelative(15.07f, 15.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -4.21f)
            lineToRelative(8.22f, -8.22f)
            arcToRelative(17.75f, 17.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.14f, -6.82f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.68f, -2.31f)
            close()
            moveTo(17.68f, 7.74f)
            lineTo(9.9f, 15.51f)
            curveToRelative(-0.21f, -0.25f, -0.43f, -0.5f, -0.67f, -0.74f)
            reflectiveCurveToRelative(-0.49f, -0.46f, -0.74f, -0.67f)
            lineToRelative(7.78f, -7.78f)
            arcToRelative(13.94f, 13.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.36f, -2.95f)
            arcToRelative(13.95f, 13.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.95f, 4.36f)
            close()
        }
    }.also { _Sword = it }
