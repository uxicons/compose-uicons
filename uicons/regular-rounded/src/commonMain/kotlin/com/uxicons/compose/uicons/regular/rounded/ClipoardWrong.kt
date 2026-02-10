package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipoardWrong: ImageVector? = null

val Icons.Rr.ClipoardWrong: ImageVector
    get() = _ClipoardWrong ?: UXIcon(name = "ClipoardWrong") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.71f, 13.71f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(2.29f, 2.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-2.29f, -2.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(22f, 10.48f)
                verticalLineToRelative(8.52f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(7f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(2f, 5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(4.51f)
                curveToRelative(1.87f, 0f, 3.63f, 0.73f, 4.95f, 2.05f)
                lineToRelative(3.48f, 3.48f)
                curveToRelative(1.32f, 1.32f, 2.05f, 3.08f, 2.05f, 4.95f)
                close()
                moveTo(15.05f, 3.46f)
                curveToRelative(-0.32f, -0.32f, -0.68f, -0.56f, -1.05f, -0.78f)
                lineTo(14f, 7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.32f)
                curveToRelative(-0.22f, -0.38f, -0.47f, -0.74f, -0.78f, -1.05f)
                lineToRelative(-3.48f, -3.48f)
                close()
                moveTo(20f, 10.49f)
                curveToRelative(0f, -0.17f, -0.03f, -0.32f, -0.05f, -0.48f)
                horizontalLineToRelative(-4.95f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(12f, 2.05f)
                curveToRelative(-0.16f, -0.02f, -0.32f, -0.05f, -0.48f, -0.05f)
                lineTo(7f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(20f, 10.48f)
                close()
            }
        }.also { _ClipoardWrong = it}
