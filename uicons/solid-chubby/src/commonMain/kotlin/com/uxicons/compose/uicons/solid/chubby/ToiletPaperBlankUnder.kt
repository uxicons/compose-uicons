package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperBlankUnder: ImageVector? = null

val Icons.Sc.ToiletPaperBlankUnder: ImageVector
    get() = _ToiletPaperBlankUnder ?: UXIcon(name = "ToiletPaperBlankUnder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 14f)
                curveToRelative(2.5f, 0f, 2.85f, -1.15f, 3.31f, -3.73f)
                lineToRelative(0.19f, -2.77f)
                lineToRelative(-0.19f, -2.77f)
                curveToRelative(-0.46f, -2.58f, -0.81f, -3.73f, -3.31f, -3.73f)
                reflectiveCurveToRelative(-2.85f, 1.15f, -3.31f, 3.73f)
                curveToRelative(0f, 0f, -0.19f, 1.42f, -0.19f, 2.77f)
                reflectiveCurveToRelative(0.19f, 2.77f, 0.19f, 2.77f)
                curveToRelative(0.46f, 2.58f, 0.81f, 3.73f, 3.31f, 3.73f)
                close()
                moveTo(16.5f, 6f)
                curveToRelative(0.55f, 0f, 1f, 0.67f, 1f, 1.5f)
                reflectiveCurveToRelative(-0.45f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.67f, -1f, -1.5f)
                reflectiveCurveToRelative(0.45f, -1.5f, 1f, -1.5f)
                close()
                moveTo(12.29f, 14f)
                horizontalLineToRelative(-7.33f)
                curveToRelative(-3.08f, 0f, -3.44f, -2.03f, -3.78f, -3.98f)
                curveToRelative(-0.01f, -0.09f, -0.18f, -1.32f, -0.18f, -2.52f)
                reflectiveCurveToRelative(0.17f, -2.42f, 0.17f, -2.48f)
                curveToRelative(0.35f, -2.0f, 0.71f, -4.02f, 3.79f, -4.02f)
                horizontalLineToRelative(7.34f)
                curveToRelative(-0.66f, 1.05f, -0.89f, 2.34f, -1.09f, 3.46f)
                curveToRelative(-0.01f, 0.06f, -0.21f, 1.57f, -0.21f, 3.04f)
                reflectiveCurveToRelative(0.2f, 2.97f, 0.22f, 3.11f)
                curveToRelative(0.19f, 1.08f, 0.42f, 2.35f, 1.07f, 3.39f)
                close()
                moveTo(23f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-10f)
                curveToRelative(-2.69f, 0f, -4f, -1.31f, -4f, -4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.65f, 0f, 2.75f, -0.45f, 3.5f, -1.14f)
                verticalLineToRelative(4.14f)
                curveToRelative(0f, 1.59f, 0.41f, 2f, 2f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _ToiletPaperBlankUnder = it}
