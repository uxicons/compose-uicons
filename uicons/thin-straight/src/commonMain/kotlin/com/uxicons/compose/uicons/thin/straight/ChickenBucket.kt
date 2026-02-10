package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChickenBucket: ImageVector? = null

val Icons.Ts.ChickenBucket: ImageVector
    get() = _ChickenBucket ?: UXIcon(name = "ChickenBucket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 15f)
                horizontalLineToRelative(0.79f)
                lineToRelative(1.18f, 1.18f)
                curveToRelative(-0.28f, 0.18f, -0.47f, 0.47f, -0.47f, 0.82f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveToRelative(-0.35f, 0f, -0.65f, 0.19f, -0.82f, 0.47f)
                lineToRelative(-1.18f, -1.18f)
                curveToRelative(-0.06f, -1.27f, 0.08f, -4.85f, -1.75f, -7.05f)
                curveToRelative(-1.66f, -1.66f, -4.35f, -1.66f, -6.01f, 0f)
                reflectiveCurveToRelative(-1.66f, 4.35f, 0f, 6.01f)
                curveToRelative(1.56f, 1.56f, 5.77f, 1.73f, 6.25f, 1.75f)
                close()
                moveTo(7.95f, 7.95f)
                curveToRelative(1.27f, -1.27f, 3.33f, -1.27f, 4.6f, 0f)
                curveToRelative(1.2f, 1.34f, 1.45f, 4.6f, 1.45f, 6.05f)
                curveToRelative(-1.45f, -0.01f, -4.72f, -0.25f, -6.05f, -1.45f)
                curveToRelative(-1.27f, -1.27f, -1.27f, -3.33f, 0f, -4.6f)
                close()
                moveTo(24f, 2f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.06f)
                lineToRelative(2.21f, 16.83f)
                curveToRelative(0.16f, 1.24f, 1.23f, 2.17f, 2.48f, 2.17f)
                horizontalLineToRelative(12.49f)
                curveToRelative(1.25f, 0f, 2.31f, -0.94f, 2.48f, -2.17f)
                lineToRelative(2.21f, -16.83f)
                horizontalLineToRelative(1.06f)
                close()
                moveTo(19.73f, 19.7f)
                curveToRelative(-0.1f, 0.74f, -0.74f, 1.3f, -1.49f, 1.3f)
                horizontalLineToRelative(-12.49f)
                curveToRelative(-0.75f, 0f, -1.39f, -0.56f, -1.49f, -1.3f)
                lineToRelative(-2.2f, -16.7f)
                horizontalLineToRelative(19.86f)
                close()
            }
        }.also { _ChickenBucket = it}
