package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SciencePodcast: ImageVector? = null

val Icons.Ss.SciencePodcast: ImageVector
    get() = _SciencePodcast ?: UXIcon(name = "SciencePodcast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(20f, 12f)
                verticalLineToRelative(0.53f)
                curveToRelative(0f, 4.12f, -3.35f, 7.47f, -7.47f, 7.47f)
                horizontalLineToRelative(-1.06f)
                curveToRelative(-4.12f, 0f, -7.47f, -3.35f, -7.47f, -7.47f)
                verticalLineToRelative(-0.53f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.53f)
                curveToRelative(0f, 5.06f, 4.0f, 9.2f, 9f, 9.45f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.02f)
                curveToRelative(5.0f, -0.25f, 9f, -4.38f, 9f, -9.45f)
                verticalLineToRelative(-0.53f)
                close()
                moveTo(12f, 17f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                close()
            }
        }.also { _SciencePodcast = it}
