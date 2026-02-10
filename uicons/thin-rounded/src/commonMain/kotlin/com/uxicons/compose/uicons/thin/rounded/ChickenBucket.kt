package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChickenBucket: ImageVector? = null

val Icons.Tr.ChickenBucket: ImageVector
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
                moveTo(23.5f, 2f)
                horizontalLineToRelative(-23f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.56f)
                lineToRelative(1.99f, 15.09f)
                curveToRelative(0.29f, 2.23f, 2.21f, 3.91f, 4.46f, 3.91f)
                horizontalLineToRelative(8.98f)
                curveToRelative(2.25f, 0f, 4.17f, -1.68f, 4.46f, -3.91f)
                lineToRelative(1.99f, -15.09f)
                horizontalLineToRelative(0.56f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(19.96f, 17.96f)
                curveToRelative(-0.23f, 1.74f, -1.72f, 3.04f, -3.47f, 3.04f)
                horizontalLineToRelative(-8.98f)
                curveToRelative(-1.75f, 0f, -3.24f, -1.31f, -3.47f, -3.04f)
                lineToRelative(-1.97f, -14.96f)
                horizontalLineToRelative(19.86f)
                close()
            }
        }.also { _ChickenBucket = it}
