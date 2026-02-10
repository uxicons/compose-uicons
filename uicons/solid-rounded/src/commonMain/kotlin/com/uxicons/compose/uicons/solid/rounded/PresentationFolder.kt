package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PresentationFolder: ImageVector? = null

val Icons.Sr.PresentationFolder: ImageVector
    get() = _PresentationFolder ?: UXIcon(name = "PresentationFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 0f)
                horizontalLineToRelative(-22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                verticalLineToRelative(-2.28f)
                horizontalLineToRelative(5f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-11f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2.45f)
                curveToRelative(0.63f, 0f, 1.23f, 0.19f, 1.74f, 0.55f)
                lineToRelative(0.37f, 0.26f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0.17f, 0.12f, 0.37f, 0.18f, 0.58f, 0.18f)
                horizontalLineToRelative(2.86f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7f, 8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.45f)
                curveToRelative(0.21f, 0f, 0.41f, 0.06f, 0.58f, 0.18f)
                lineToRelative(0.37f, 0.26f)
                curveToRelative(0.51f, 0.36f, 1.11f, 0.55f, 1.74f, 0.55f)
                horizontalLineToRelative(2.86f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                close()
                moveTo(17f, 10f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _PresentationFolder = it}
