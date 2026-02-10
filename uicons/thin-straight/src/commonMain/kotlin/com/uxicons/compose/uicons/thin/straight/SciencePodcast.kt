package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SciencePodcast: ImageVector? = null

val Icons.Ts.SciencePodcast: ImageVector
    get() = _SciencePodcast ?: UXIcon(name = "SciencePodcast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                close()
                moveTo(22f, 12f)
                verticalLineToRelative(0.56f)
                curveToRelative(0f, 5.21f, -4.24f, 9.44f, -9.44f, 9.44f)
                horizontalLineToRelative(-0.06f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(-5.21f, 0f, -9.44f, -4.24f, -9.44f, -9.44f)
                verticalLineToRelative(-0.56f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.56f)
                curveToRelative(0f, 4.65f, 3.79f, 8.44f, 8.44f, 8.44f)
                horizontalLineToRelative(1.12f)
                curveToRelative(4.66f, 0f, 8.44f, -3.79f, 8.44f, -8.44f)
                verticalLineToRelative(-0.56f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _SciencePodcast = it}
