package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortShapesDown: ImageVector? = null

val Icons.Rr.SortShapesDown: ImageVector
    get() = _SortShapesDown ?: UXIcon(name = "SortShapesDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                close()
                moveTo(16f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(11.72f, 18.31f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
                lineToRelative(-3.59f, 3.41f)
                curveToRelative(-0.55f, 0.55f, -1.3f, 0.86f, -2.1f, 0.86f)
                reflectiveCurveToRelative(-1.55f, -0.31f, -2.12f, -0.88f)
                lineTo(0.31f, 19.72f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.03f, -1.41f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.42f, 1.41f, -0.03f)
                lineToRelative(3.31f, 3.15f)
                lineTo(5f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(7f, 21.43f)
                lineToRelative(3.31f, -3.15f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.36f, 1.41f, 0.03f)
                close()
                moveTo(23.19f, 19.58f)
                lineToRelative(-2.69f, -4.39f)
                curveToRelative(-0.4f, -0.74f, -1.17f, -1.2f, -2.01f, -1.2f)
                reflectiveCurveToRelative(-1.61f, 0.46f, -1.98f, 1.15f)
                lineToRelative(-2.74f, 4.48f)
                curveToRelative(-0.39f, 0.71f, -0.37f, 1.56f, 0.05f, 2.26f)
                reflectiveCurveToRelative(1.15f, 1.12f, 1.96f, 1.12f)
                horizontalLineToRelative(5.43f)
                curveToRelative(0.81f, 0f, 1.55f, -0.42f, 1.96f, -1.12f)
                reflectiveCurveToRelative(0.43f, -1.54f, 0.02f, -2.3f)
                close()
                moveTo(21.45f, 20.86f)
                curveToRelative(-0.04f, 0.06f, -0.11f, 0.14f, -0.24f, 0.14f)
                horizontalLineToRelative(-5.43f)
                curveToRelative(-0.13f, 0f, -0.21f, -0.08f, -0.24f, -0.14f)
                curveToRelative(-0.04f, -0.06f, -0.07f, -0.16f, -0.03f, -0.23f)
                lineToRelative(2.74f, -4.48f)
                curveToRelative(0.07f, -0.12f, 0.17f, -0.15f, 0.25f, -0.15f)
                reflectiveCurveToRelative(0.18f, 0.03f, 0.28f, 0.19f)
                lineToRelative(2.69f, 4.39f)
                curveToRelative(0.06f, 0.12f, 0.03f, 0.22f, 0f, 0.28f)
                close()
            }
        }.also { _SortShapesDown = it}
