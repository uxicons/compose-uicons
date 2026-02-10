package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Workflow: ImageVector? = null

val Icons.Br.Workflow: ImageVector
    get() = _Workflow ?: UXIcon(name = "Workflow") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15f, 12.5f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
            moveTo(13f, 1f)
            curveToRelative(-0.55f, -0.55f, -1.45f, -0.55f, -2f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.55f, 0.55f, -0.55f, 1.45f, 0f, 2f)
            lineToRelative(2f, 2f)
            curveToRelative(0.55f, 0.55f, 1.45f, 0.55f, 2f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.55f, -0.55f, 0.55f, -1.45f, 0f, -2f)
            lineToRelative(-2f, -2f)
            close()
            moveTo(13.5f, 17f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(20.5f, 2f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-0.95f)
            curveToRelative(0f, -0.69f, -0.83f, -1.04f, -1.32f, -0.55f)
            lineToRelative(-2.45f, 2.45f)
            curveToRelative(-0.3f, 0.3f, -0.3f, 0.79f, 0f, 1.1f)
            lineToRelative(2.45f, 2.45f)
            curveToRelative(0.49f, 0.49f, 1.32f, 0.14f, 1.32f, -0.55f)
            verticalLineToRelative(-0.95f)
            horizontalLineToRelative(0.5f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(5.32f, 17.5f)
            curveToRelative(-0.49f, -0.49f, -1.32f, -0.14f, -1.32f, 0.55f)
            verticalLineToRelative(0.95f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(0.95f)
            curveToRelative(0f, 0.69f, 0.83f, 1.04f, 1.32f, 0.55f)
            lineToRelative(2.45f, -2.45f)
            curveToRelative(0.3f, -0.3f, 0.3f, -0.79f, 0f, -1.1f)
            lineToRelative(-2.45f, -2.45f)
            close()
        }
    }.also { _Workflow = it }
