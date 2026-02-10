package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertSquare: ImageVector? = null

val Icons.Br.InsertSquare: ImageVector
    get() = _InsertSquare ?: UXIcon(name = "InsertSquare") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.55f, 10.43f)
            curveToRelative(0.59f, 0.58f, 0.6f, 1.53f, 0.02f, 2.12f)
            curveToRelative(-0.29f, 0.3f, -0.68f, 0.45f, -1.07f, 0.45f)
            curveToRelative(-0.38f, 0f, -0.76f, -0.14f, -1.05f, -0.43f)
            lineToRelative(-1.95f, -1.91f)
            verticalLineToRelative(11.84f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-11.84f)
            lineToRelative(-1.95f, 1.91f)
            curveToRelative(-0.59f, 0.58f, -1.54f, 0.57f, -2.12f, -0.02f)
            curveToRelative(-0.58f, -0.59f, -0.57f, -1.54f, 0.02f, -2.12f)
            lineToRelative(3.79f, -3.71f)
            curveToRelative(0.96f, -0.96f, 2.55f, -0.96f, 3.52f, 0.01f)
            lineToRelative(3.78f, 3.69f)
            close()
            moveTo(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
        }
    }.also { _InsertSquare = it }
