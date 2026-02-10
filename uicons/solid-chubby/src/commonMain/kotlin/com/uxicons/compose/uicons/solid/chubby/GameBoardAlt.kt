package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GameBoardAlt: ImageVector? = null

val Icons.Sc.GameBoardAlt: ImageVector
    get() = _GameBoardAlt ?: UXIcon(name = "GameBoardAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.0f, 13.0f)
                lineToRelative(0f, 3.39f)
                lineToRelative(3.39f, -3.39f)
                lineToRelative(-3.39f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.0f, 11.0f)
                lineToRelative(0f, -2.85f)
                lineToRelative(-2.85f, 2.85f)
                lineToRelative(2.85f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.82f, 2.85f)
                curveToRelative(-0.1f, -0.33f, -0.36f, -0.58f, -0.69f, -0.67f)
                curveToRelative(-0.16f, -0.04f, -3.73f, -1.03f, -8.13f, -1.17f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(-0.13f, -4.67f, -1.14f, -8.0f, -1.18f, -8.15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.32f, 11.0f)
                lineToRelative(5.68f, -5.68f)
                lineToRelative(0f, -2.5f)
                lineToRelative(-8.18f, 8.18f)
                lineToRelative(2.5f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.18f, 21.15f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.16f, 0.04f, 3.73f, 1.03f, 8.13f, 1.17f)
                verticalLineTo(13.0f)
                horizontalLineTo(1f)
                curveToRelative(0.13f, 4.67f, 1.14f, 8.0f, 1.18f, 8.15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.13f, 21.82f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.68f)
                curveToRelative(0.04f, -0.13f, 0.82f, -2.74f, 1.1f, -6.51f)
                lineToRelative(-8.26f, 8.26f)
                curveToRelative(3.61f, -0.29f, 6.34f, -1.04f, 6.48f, -1.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.23f, 13.0f)
                lineToRelative(-6.22f, 6.22f)
                lineToRelative(0f, 2.5f)
                lineToRelative(8.72f, -8.72f)
                lineToRelative(-2.5f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.87f, 2.17f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.68f)
                curveToRelative(-0.04f, 0.14f, -0.9f, 3.01f, -1.14f, 7.09f)
                lineTo(9.93f, 1.05f)
                curveToRelative(-3.9f, 0.24f, -6.92f, 1.08f, -7.07f, 1.12f)
                close()
            }
        }.also { _GameBoardAlt = it}
