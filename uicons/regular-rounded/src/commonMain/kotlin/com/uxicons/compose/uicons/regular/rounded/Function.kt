package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Function: ImageVector? = null

val Icons.Rr.Function: ImageVector
    get() = _Function ?: UXIcon(name = "Function") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.63f)
                lineToRelative(-0.91f, 6.67f)
                curveToRelative(-0.34f, 2.47f, -2.46f, 4.33f, -4.95f, 4.33f)
                horizontalLineToRelative(-0.51f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.51f)
                curveToRelative(1.49f, 0f, 2.77f, -1.11f, 2.97f, -2.6f)
                lineToRelative(0.87f, -6.41f)
                horizontalLineToRelative(-1.35f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.63f)
                lineToRelative(0.91f, -6.67f)
                curveToRelative(0.34f, -2.47f, 2.46f, -4.33f, 4.95f, -4.33f)
                horizontalLineToRelative(0.51f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.51f)
                curveToRelative(-1.49f, 0f, -2.77f, 1.11f, -2.97f, 2.6f)
                lineToRelative(-0.87f, 6.41f)
                horizontalLineToRelative(1.35f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(18.23f, 19.5f)
                lineToRelative(2.08f, -2.92f)
                curveToRelative(0.32f, -0.45f, 0.22f, -1.07f, -0.23f, -1.4f)
                curveToRelative(-0.45f, -0.32f, -1.07f, -0.22f, -1.4f, 0.23f)
                lineToRelative(-1.69f, 2.36f)
                lineToRelative(-1.69f, -2.36f)
                curveToRelative(-0.32f, -0.45f, -0.95f, -0.56f, -1.4f, -0.23f)
                curveToRelative(-0.45f, 0.32f, -0.55f, 0.94f, -0.23f, 1.4f)
                lineToRelative(2.08f, 2.92f)
                lineToRelative(-2.08f, 2.92f)
                curveToRelative(-0.32f, 0.45f, -0.22f, 1.07f, 0.23f, 1.4f)
                curveToRelative(0.18f, 0.13f, 0.38f, 0.19f, 0.58f, 0.19f)
                curveToRelative(0.31f, 0f, 0.62f, -0.15f, 0.81f, -0.42f)
                lineToRelative(1.69f, -2.36f)
                lineToRelative(1.69f, 2.36f)
                curveToRelative(0.2f, 0.27f, 0.5f, 0.42f, 0.81f, 0.42f)
                curveToRelative(0.2f, 0f, 0.4f, -0.06f, 0.58f, -0.19f)
                curveToRelative(0.45f, -0.32f, 0.55f, -0.94f, 0.23f, -1.4f)
                lineToRelative(-2.08f, -2.92f)
                close()
            }
        }.also { _Function = it}
