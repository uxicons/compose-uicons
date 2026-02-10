package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownStrenght: ImageVector? = null

val Icons.Tr.ArrowDownStrenght: ImageVector
    get() = _ArrowDownStrenght ?: UXIcon(name = "ArrowDownStrenght") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(23.5f, 23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(0.28f, 17.95f)
                curveToRelative(0.17f, 0.08f, 4.32f, 2.05f, 11.72f, 2.05f)
                horizontalLineToRelative(0.01f)
                curveToRelative(7.4f, 0f, 11.54f, -1.97f, 11.71f, -2.05f)
                curveToRelative(0.25f, -0.12f, 0.35f, -0.42f, 0.23f, -0.67f)
                curveToRelative(-0.12f, -0.25f, -0.42f, -0.35f, -0.67f, -0.23f)
                curveToRelative(-0.04f, 0.02f, -4.13f, 1.95f, -11.28f, 1.95f)
                reflectiveCurveTo(0.76f, 17.07f, 0.72f, 17.05f)
                curveToRelative(-0.25f, -0.12f, -0.55f, -0.01f, -0.67f, 0.23f)
                curveToRelative(-0.12f, 0.25f, -0.02f, 0.55f, 0.23f, 0.67f)
                close()
                moveTo(11.99f, 16f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0.0f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(7.29f, -0.0f, 11.69f, -4.96f, 11.88f, -5.17f)
                curveToRelative(0.18f, -0.21f, 0.16f, -0.52f, -0.05f, -0.7f)
                curveToRelative(-0.21f, -0.18f, -0.52f, -0.16f, -0.71f, 0.05f)
                curveToRelative(-0.04f, 0.05f, -4.3f, 4.83f, -11.12f, 4.83f)
                curveToRelative(-6.83f, 0f, -11.08f, -4.78f, -11.12f, -4.83f)
                curveToRelative(-0.18f, -0.21f, -0.5f, -0.23f, -0.71f, -0.05f)
                curveToRelative(-0.21f, 0.18f, -0.23f, 0.5f, -0.05f, 0.7f)
                curveToRelative(0.18f, 0.21f, 4.58f, 5.17f, 11.87f, 5.17f)
                close()
                moveTo(10.95f, 10.56f)
                curveToRelative(0.58f, 0.58f, 1.52f, 0.58f, 2.1f, 0f)
                lineToRelative(3.3f, -3.3f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-3.15f, 3.15f)
                lineTo(12.5f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(11.5f, 9.7f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(3.3f, 3.3f)
                close()
            }
        }.also { _ArrowDownStrenght = it}
