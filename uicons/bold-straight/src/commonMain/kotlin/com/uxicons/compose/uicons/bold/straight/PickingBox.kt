package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PickingBox: ImageVector? = null

val Icons.Bs.PickingBox: ImageVector
    get() = _PickingBox ?: UXIcon(name = "PickingBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.02f, 5.27f)
                curveToRelative(0.37f, -0.13f, 0.98f, -0.27f, 1.48f, -0.27f)
                curveToRelative(2f, 0f, 3.8f, 1.49f, 4.31f, 3.28f)
                lineToRelative(2.63f, -2.28f)
                horizontalLineToRelative(5.56f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.44f)
                lineToRelative(-3.63f, 3.15f)
                curveToRelative(-1.19f, 1.44f, -2.67f, 2.42f, -2.91f, 2.57f)
                curveToRelative(-0.32f, 0.19f, -0.68f, 0.28f, -1.02f, 0.28f)
                curveToRelative(-0.68f, 0f, -1.34f, -0.35f, -1.72f, -0.97f)
                curveToRelative(-0.56f, -0.95f, -0.26f, -2.17f, 0.69f, -2.74f)
                curveToRelative(0.85f, -0.52f, 1.53f, -0.87f, 2.03f, -1.79f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.17f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5.54f)
                lineToRelative(-2.44f, 2.44f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
                lineToRelative(4.17f, -4.17f)
                lineToRelative(-2.75f, 0.69f)
                verticalLineToRelative(-0.0f)
                curveToRelative(-0.12f, 0.03f, -0.24f, 0.05f, -0.36f, 0.05f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.7f, 0.48f, -1.29f, 1.14f, -1.45f)
                verticalLineToRelative(-0.0f)
                reflectiveCurveTo(11.5f, 0f, 11.5f, 0f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-11.5f)
                curveToRelative(-1.3f, 0f, -2.36f, 1f, -2.48f, 2.27f)
                close()
                moveTo(15f, 18f)
                verticalLineToRelative(6f)
                lineTo(6f, 24f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(12f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _PickingBox = it}
