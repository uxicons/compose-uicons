package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoneBreak: ImageVector? = null

val Icons.Ss.BoneBreak: ImageVector
    get() = _BoneBreak ?: UXIcon(name = "BoneBreak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.46f, 16.08f)
                curveToRelative(0.27f, 0.48f, 0.44f, 1.03f, 0.44f, 1.62f)
                curveToRelative(0f, 1.82f, -1.48f, 3.3f, -3.3f, 3.3f)
                reflectiveCurveToRelative(-3.3f, -1.48f, -3.3f, -3.3f)
                curveToRelative(0f, -0.32f, 0.05f, -0.62f, 0.14f, -0.91f)
                lineToRelative(-4.44f, -1.27f)
                lineToRelative(-4.44f, 1.27f)
                curveToRelative(0.08f, 0.29f, 0.14f, 0.59f, 0.14f, 0.91f)
                curveToRelative(0f, 1.82f, -1.48f, 3.3f, -3.3f, 3.3f)
                reflectiveCurveToRelative(-3.3f, -1.48f, -3.3f, -3.3f)
                curveToRelative(0f, -0.59f, 0.17f, -1.14f, 0.44f, -1.62f)
                curveToRelative(-0.92f, -0.58f, -1.54f, -1.61f, -1.54f, -2.78f)
                curveToRelative(0f, -1.82f, 1.48f, -3.3f, 3.3f, -3.3f)
                curveToRelative(1.54f, 0f, 2.81f, 1.05f, 3.18f, 2.47f)
                lineToRelative(4.07f, -1.23f)
                lineToRelative(1.44f, 3.35f)
                lineToRelative(1.14f, -3.33f)
                lineToRelative(4.38f, 1.26f)
                curveToRelative(0.35f, -1.44f, 1.65f, -2.52f, 3.2f, -2.52f)
                curveToRelative(1.82f, 0f, 3.3f, 1.48f, 3.3f, 3.3f)
                curveToRelative(0f, 1.17f, -0.62f, 2.2f, -1.54f, 2.78f)
                close()
                moveTo(13f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                lineTo(13f, 2f)
                close()
                moveTo(18.87f, 4.04f)
                lineToRelative(-1.73f, -1f)
                lineToRelative(-2f, 3.46f)
                lineToRelative(1.73f, 1f)
                lineToRelative(2f, -3.46f)
                close()
                moveTo(8.87f, 6.5f)
                lineToRelative(-2f, -3.46f)
                lineToRelative(-1.73f, 1f)
                lineToRelative(2f, 3.46f)
                lineToRelative(1.73f, -1f)
                close()
            }
        }.also { _BoneBreak = it}
