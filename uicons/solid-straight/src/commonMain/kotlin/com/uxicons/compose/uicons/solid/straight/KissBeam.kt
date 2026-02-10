package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KissBeam: ImageVector? = null

val Icons.Ss.KissBeam: ImageVector
    get() = _KissBeam ?: UXIcon(name = "KissBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(8f, 9f)
                curveToRelative(-0.32f, 0f, -1f, 0.95f, -1f, 2f)
                lineTo(5f, 11f)
                curveToRelative(0.25f, -5.29f, 5.75f, -5.28f, 6f, 0f)
                lineTo(9f, 11f)
                curveTo(9f, 9.95f, 8.32f, 9f, 8f, 9f)
                close()
                moveTo(15f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 20f)
                lineTo(11f, 20f)
                lineTo(11f, 18f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1f)
                lineTo(12f, 17f)
                lineTo(12f, 15f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1f)
                lineTo(11f, 14f)
                lineTo(11f, 12f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.99f, 4f)
                arcTo(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17.5f)
                close()
                moveTo(17f, 11f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                lineTo(13f, 11f)
                curveToRelative(0.25f, -5.29f, 5.75f, -5.28f, 6f, 0f)
                close()
            }
        }.also { _KissBeam = it}
