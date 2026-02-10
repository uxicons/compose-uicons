package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToBottom: ImageVector? = null

val Icons.Tr.ArrowToBottom: ImageVector
    get() = _ArrowToBottom ?: UXIcon(name = "ArrowToBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 23f)
                horizontalLineToRelative(-5.6f)
                curveToRelative(0.32f, -0.12f, 0.61f, -0.31f, 0.87f, -0.56f)
                lineToRelative(5.09f, -5.09f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-5.09f, 5.09f)
                curveToRelative(-0.16f, 0.16f, -0.36f, 0.27f, -0.56f, 0.34f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(22.07f)
                curveToRelative(-0.2f, -0.07f, -0.4f, -0.18f, -0.56f, -0.34f)
                lineToRelative(-5.09f, -5.09f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(5.09f, 5.09f)
                curveToRelative(0.26f, 0.26f, 0.55f, 0.44f, 0.87f, 0.56f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _ArrowToBottom = it}
