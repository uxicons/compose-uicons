package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AttributionPencil: ImageVector? = null

val Icons.Bs.AttributionPencil: ImageVector
    get() = _AttributionPencil ?: UXIcon(name = "AttributionPencil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                curveToRelative(-1.8f, 0f, -2.67f, -1.3f, -3.25f, -2.17f)
                curveToRelative(-0.39f, -0.59f, -0.58f, -0.83f, -0.75f, -0.83f)
                curveToRelative(-0.28f, 0f, -0.63f, 0.38f, -1.12f, 0.97f)
                curveToRelative(-0.72f, 0.86f, -1.72f, 2.03f, -3.41f, 2.03f)
                reflectiveCurveToRelative(-2.68f, -1.18f, -3.39f, -2.05f)
                curveToRelative(-0.47f, -0.57f, -0.8f, -0.95f, -1.07f, -0.95f)
                reflectiveCurveToRelative(-0.58f, 0.31f, -1.08f, 0.83f)
                curveToRelative(-0.85f, 0.87f, -2.14f, 2.17f, -4.42f, 2.17f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.98f, 0f, 1.48f, -0.46f, 2.28f, -1.28f)
                curveToRelative(0.75f, -0.77f, 1.69f, -1.72f, 3.22f, -1.72f)
                curveToRelative(1.71f, 0f, 2.68f, 1.18f, 3.39f, 2.05f)
                curveToRelative(0.47f, 0.57f, 0.8f, 0.95f, 1.07f, 0.95f)
                reflectiveCurveToRelative(0.63f, -0.38f, 1.12f, -0.97f)
                curveToRelative(0.72f, -0.86f, 1.72f, -2.03f, 3.41f, -2.03f)
                curveToRelative(1.8f, 0f, 2.67f, 1.3f, 3.25f, 2.17f)
                curveToRelative(0.39f, 0.59f, 0.58f, 0.83f, 0.75f, 0.83f)
                verticalLineToRelative(3f)
                close()
                moveTo(21.67f, 6.09f)
                lineToRelative(1.55f, -1.55f)
                curveToRelative(1.04f, -1.04f, 1.04f, -2.72f, 0f, -3.76f)
                reflectiveCurveToRelative(-2.72f, -1.04f, -3.76f, 0f)
                lineToRelative(-1.55f, 1.55f)
                lineToRelative(3.76f, 3.76f)
                close()
                moveTo(15.79f, 4.45f)
                lineToRelative(-7.79f, 7.79f)
                verticalLineToRelative(3.76f)
                horizontalLineToRelative(3.76f)
                lineToRelative(7.79f, -7.79f)
                lineToRelative(-3.76f, -3.76f)
                close()
            }
        }.also { _AttributionPencil = it}
