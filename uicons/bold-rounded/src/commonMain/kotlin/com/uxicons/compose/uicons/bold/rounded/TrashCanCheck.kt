package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanCheck: ImageVector? = null

val Icons.Br.TrashCanCheck: ImageVector
    get() = _TrashCanCheck ?: UXIcon(name = "TrashCanCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.64f, 11.03f)
            curveToRelative(0.57f, 0.6f, 0.54f, 1.55f, -0.06f, 2.12f)
            lineToRelative(-3.05f, 2.87f)
            curveToRelative(-0.66f, 0.65f, -1.54f, 0.98f, -2.42f, 0.98f)
            reflectiveCurveToRelative(-1.78f, -0.33f, -2.46f, -0.99f)
            lineToRelative(-1.17f, -1.02f)
            curveToRelative(-0.62f, -0.55f, -0.68f, -1.49f, -0.14f, -2.12f)
            curveToRelative(0.55f, -0.62f, 1.49f, -0.69f, 2.12f, -0.14f)
            lineToRelative(1.23f, 1.08f)
            curveToRelative(0.25f, 0.24f, 0.57f, 0.24f, 0.76f, 0.05f)
            lineToRelative(3.07f, -2.89f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.54f, 2.12f, 0.06f)
            close()
            moveTo(23f, 4.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(3f, 6f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3.76f)
            curveToRelative(0.62f, -1.75f, 2.29f, -3f, 4.24f, -3f)
            horizontalLineToRelative(3f)
            curveToRelative(1.96f, 0f, 3.62f, 1.25f, 4.24f, 3f)
            horizontalLineToRelative(3.76f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(18f, 6f)
            lineTo(6f, 6f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(18f, 6f)
            close()
        }
    }.also { _TrashCanCheck = it }
