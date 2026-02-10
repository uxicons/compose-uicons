package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SciencePodcast: ImageVector? = null

val Icons.Rs.SciencePodcast: ImageVector
    get() = _SciencePodcast ?: UXIcon(name = "SciencePodcast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(15f, 6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6f)
                close()
                moveTo(22f, 12f)
                verticalLineToRelative(0.53f)
                curveToRelative(0f, 5.06f, -4.0f, 9.2f, -9f, 9.45f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.02f)
                curveToRelative(-5.0f, -0.25f, -9f, -4.38f, -9f, -9.45f)
                verticalLineToRelative(-0.53f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.53f)
                curveToRelative(0f, 4.12f, 3.35f, 7.47f, 7.47f, 7.47f)
                horizontalLineToRelative(1.06f)
                curveToRelative(4.12f, 0f, 7.47f, -3.35f, 7.47f, -7.47f)
                verticalLineToRelative(-0.53f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _SciencePodcast = it}
