package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinBeamSweat: ImageVector? = null

val Icons.Bs.GrinBeamSweat: ImageVector
    get() = _GrinBeamSweat ?: UXIcon(name = "GrinBeamSweat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 14f)
                arcToRelative(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 1f)
                arcToRelative(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.01f, -1f)
                curveToRelative(-0.61f, 2.28f, -2.66f, 5f, -6f, 5f)
                reflectiveCurveTo(6.62f, 16.28f, 6f, 14f)
                close()
                moveTo(20.5f, 7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 4.5f)
                curveTo(23f, 2.46f, 20.5f, 0f, 20.5f, 0f)
                reflectiveCurveTo(18f, 2.51f, 18f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 7f)
                close()
                moveTo(23.3f, 8f)
                arcToRelative(4.42f, 4.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, 1f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 12f)
                curveTo(2.84f, 5.46f, 10.3f, 0.89f, 16.03f, 3.97f)
                arcToRelative(7.39f, 7.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.05f, -2.82f)
                curveTo(9.45f, -2.68f, -0.21f, 3.41f, 0f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 24f)
                curveTo(20.12f, 24.16f, 26.16f, 15.56f, 23.3f, 8f)
                close()
                moveTo(8f, 7f)
                curveToRelative(-2.27f, 0f, -3f, 3.37f, -3f, 5f)
                curveToRelative(2.76f, -2.61f, 3.25f, -2.59f, 6f, 0f)
                curveTo(11f, 10.37f, 10.27f, 7f, 8f, 7f)
                close()
                moveTo(13f, 12f)
                curveToRelative(2.76f, -2.61f, 3.25f, -2.59f, 6f, 0f)
                curveTo(18.83f, 5.34f, 13.17f, 5.35f, 13f, 12f)
                close()
            }
        }.also { _GrinBeamSweat = it}
