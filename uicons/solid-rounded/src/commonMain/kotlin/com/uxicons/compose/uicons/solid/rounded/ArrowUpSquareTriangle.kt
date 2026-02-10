package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpSquareTriangle: ImageVector? = null

val Icons.Sr.ArrowUpSquareTriangle: ImageVector
    get() = _ArrowUpSquareTriangle ?: UXIcon(name = "ArrowUpSquareTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(23.2f, 19.58f)
                lineToRelative(-2.69f, -4.39f)
                curveToRelative(-0.4f, -0.74f, -1.17f, -1.2f, -2.01f, -1.2f)
                reflectiveCurveToRelative(-1.61f, 0.46f, -1.98f, 1.15f)
                lineToRelative(-2.74f, 4.48f)
                curveToRelative(-0.39f, 0.71f, -0.37f, 1.56f, 0.05f, 2.26f)
                reflectiveCurveToRelative(1.15f, 1.11f, 1.96f, 1.11f)
                horizontalLineToRelative(5.43f)
                curveToRelative(0.81f, 0f, 1.55f, -0.42f, 1.96f, -1.11f)
                reflectiveCurveToRelative(0.43f, -1.54f, 0.02f, -2.3f)
                close()
                moveTo(11.71f, 6.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(7.41f, 0.59f)
                curveTo(7.02f, 0.2f, 6.51f, 0f, 6f, 0f)
                reflectiveCurveToRelative(-1.02f, 0.2f, -1.41f, 0.58f)
                lineTo(0.29f, 4.88f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(3.29f, -3.29f)
                lineTo(5f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(7f, 3f)
                lineToRelative(3.29f, 3.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _ArrowUpSquareTriangle = it}
